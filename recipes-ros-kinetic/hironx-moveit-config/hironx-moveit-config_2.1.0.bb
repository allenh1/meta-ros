# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An automatically generated package with all the configuration and launch files f"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native collada-urdf hironx-ros-bridge moveit-planners moveit-ros moveit-ros-move-group moveit-simple-controller-manager"
SRC_URI = "https://github.com/tork-a/rtmros_hironx-release/archive/release/kinetic/hironx_moveit_config/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9e3db542c89c3d3917b17936867e95fa"
SRC_URI[sha256sum] = "7cf8111e2b44488e4eeb51ca677ea86bf49bf8dc40bcedf42c2a3c49d38fb380"
S = "${WORKDIR}/rtmros_hironx-release-release-kinetic-hironx_moveit_config-2.1.0-0"

inherit catkin
