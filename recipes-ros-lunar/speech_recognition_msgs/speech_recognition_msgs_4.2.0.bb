# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "speech_recognition_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=baa0e06ae5fa9324482177429a2941ef"

DEPENDS = "catkin message_generation message_runtime std_msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/lunar/speech_recognition_msgs/4.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "341c2c60c8619c474da230b9083d19fb"
SRC_URI[sha256sum] = "6b12d1093ef19ad69e01672ab2583e385669843910098a8d19aaa710d2e3fabc"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
