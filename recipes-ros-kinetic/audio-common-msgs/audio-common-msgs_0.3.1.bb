# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages for transmitting audio via ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=a3ae2ba3f0f44e61270955e8cd98afcf"

DEPENDS = "catkin-native message-generation message-runtime"
SRC_URI = "https://github.com/ros-gbp/audio_common-release/archive/release/kinetic/audio_common_msgs/0.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "24abf1b16279e208fbaaf0934e638082"
SRC_URI[sha256sum] = "5e0306fe6469c982bb9c43a6e4abc112bdf0dfb32548b3e8975ad3f006fb4e75"
S = "${WORKDIR}/audio_common-release-release-kinetic-audio_common_msgs-0.3.1-0"

inherit catkin
