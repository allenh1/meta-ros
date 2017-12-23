# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The messages required by multimaster packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/kinetic/multimaster_msgs_fkie/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "60054458f4cac03452204af2928f7fc3"
SRC_URI[sha256sum] = "77d65faca6e0dbea02868af9100205dd23a05beeffbcac647d49751946719549"
S = "${WORKDIR}/multimaster_fkie-release-release-kinetic-multimaster_msgs_fkie-0.7.7-0"

inherit catkin
