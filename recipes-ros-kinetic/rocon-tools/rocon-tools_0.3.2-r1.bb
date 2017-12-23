# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Utilities and tools developed for rocon, but usable beyond the boundaries     of"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rocon-console rocon-ebnf rocon-interactions rocon-launch rocon-master-info rocon-python-comms rocon-python-redis rocon-python-utils rocon-python-wifi rocon-semantic-version rocon-uri"
SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/kinetic/rocon_tools/0.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8a5d40497c57fceecdc0c3f95be15e78"
SRC_URI[sha256sum] = "1893069c0024177840270cd2a859df90583b28a58f8e6ce7ef39599121924d48"
S = "${WORKDIR}/rocon_tools-release-release-kinetic-rocon_tools-0.3.2-1"

inherit catkin
