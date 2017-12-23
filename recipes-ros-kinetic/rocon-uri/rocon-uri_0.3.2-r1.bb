# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Module for working with rocon uri strings."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg rocon-console rocon-ebnf rocon-python-utils rospy"
SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/kinetic/rocon_uri/0.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "19773a873c51c5a92c2c196af03a4e60"
SRC_URI[sha256sum] = "02d7bc47c7edfdf438502375659dfa331d0d72fed2e73843685253a99dfe0b4b"
S = "${WORKDIR}/rocon_tools-release-release-kinetic-rocon_uri-0.3.2-1"

inherit catkin
