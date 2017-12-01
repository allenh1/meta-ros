# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_can_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/lunar/marti_can_msgs/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de18420a88996473c85e8e46af02626a"
SRC_URI[sha256sum] = "eb04ec2cad56c1498c2c8b7bfe939cc637a22f7eef91c3023b51d50469dd4624"
S = "${WORKDIR}/marti_messages-release-release-lunar-marti_can_msgs-0.4.0-0"

inherit catkin
