# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage for moveit plugins."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-fake-controller-manager moveit-ros-control-interface moveit-simple-controller-manager"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_plugins/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c54ab2d035f99d169e2124d2ddc354b5"
SRC_URI[sha256sum] = "590ffd86fc500e9b40b3272a4112545d986585923472aa5baedc7125d57f5774"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_plugins-0.9.9-0"

inherit catkin
