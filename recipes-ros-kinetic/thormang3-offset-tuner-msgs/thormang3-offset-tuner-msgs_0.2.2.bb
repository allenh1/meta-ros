# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is a set of messages and services for using thormang3_offset_tuner."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime roscpp rospy std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-msgs-release/archive/release/kinetic/thormang3_offset_tuner_msgs/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f4121dada6152292db70287899b9b7b7"
SRC_URI[sha256sum] = "e6697c377b83abc30e8e7eea026813ba51f820695db40083d1deda6070ad5e0f"
S = "${WORKDIR}/ROBOTIS-THORMANG-msgs-release-release-kinetic-thormang3_offset_tuner_msgs-0.2.2-0"

inherit catkin
