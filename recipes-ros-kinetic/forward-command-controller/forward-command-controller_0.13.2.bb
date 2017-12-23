# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "forward_command_controller"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface hardware-interface realtime-tools std-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/kinetic/forward_command_controller/0.13.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c2dd9998d8b547a9771f2dd02882e95c"
SRC_URI[sha256sum] = "96c5734cdc625293128698f59cfb04c11c578c299c8ceb03c8ddf0a0c4821e63"
S = "${WORKDIR}/ros_controllers-release-release-kinetic-forward_command_controller-0.13.2-0"

inherit catkin
