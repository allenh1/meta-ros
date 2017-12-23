# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Message and service types: custom messages and services for ROBOTIS OP3 packages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-OP3-msgs-release/archive/release/kinetic/op3_offset_tuner_msgs/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cd1ee718117a0257d3b3cb36955131d1"
SRC_URI[sha256sum] = "0f130bfcaf934b31bc12196f6157c60f27e4a52d59a4f918beb2e9c8bf01b23b"
S = "${WORKDIR}/ROBOTIS-OP3-msgs-release-release-kinetic-op3_offset_tuner_msgs-0.1.0-0"

inherit catkin
