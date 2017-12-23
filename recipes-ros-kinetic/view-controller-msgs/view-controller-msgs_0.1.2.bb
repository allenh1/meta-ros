# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages for (camera) view controllers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/view_controller_msgs-release/archive/release/kinetic/view_controller_msgs/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fa0e89f512ff268ce665f30dfb5817f9"
SRC_URI[sha256sum] = "18c0b2f99090be9199cff68e57ab95df08d90864b67c632f6d93cd9042e76a20"
S = "${WORKDIR}/view_controller_msgs-release-release-kinetic-view_controller_msgs-0.1.2-0"

inherit catkin
