# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Message and service types: custom messages and services for ROBOTIS OP3 packages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-OP3-msgs-release/archive/release/kinetic/op3_action_module_msgs/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4e5b1b138ab66d6fbc80e6d1489cede5"
SRC_URI[sha256sum] = "d357ad0d23808bdcb65fdda1f7ded508af6a34c99878239316e575e4cee1cbb7"
S = "${WORKDIR}/ROBOTIS-OP3-msgs-release-release-kinetic-op3_action_module_msgs-0.1.0-0"

inherit catkin
