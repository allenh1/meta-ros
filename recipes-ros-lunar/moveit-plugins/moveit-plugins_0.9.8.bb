# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage for moveit plugins."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native moveit-fake-controller-manager moveit-ros-control-interface moveit-simple-controller-manager"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_plugins/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e1a73b6e1b2ede808a9d39cf26f451f3"
SRC_URI[sha256sum] = "4766c01d3bb7f28057ca12f8f471a8291e4462b971ab7cf9f1d41b1110337d02"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_plugins-0.9.8-0"

inherit catkin
