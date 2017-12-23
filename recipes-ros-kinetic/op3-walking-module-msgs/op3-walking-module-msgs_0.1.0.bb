# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Message and service types: custom messages and services for ROBOTIS OP3 packages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-OP3-msgs-release/archive/release/kinetic/op3_walking_module_msgs/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b81e59a7066bf2ae357bec306958d88"
SRC_URI[sha256sum] = "7a4bb85767f29b35229b16d78ecdfbc6da894381fb6d746f3d5a2d133520fa74"
S = "${WORKDIR}/ROBOTIS-OP3-msgs-release-release-kinetic-op3_walking_module_msgs-0.1.0-0"

inherit catkin
