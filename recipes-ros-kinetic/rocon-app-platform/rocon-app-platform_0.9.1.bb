# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Robot application platform for ros robots with a default implementation in pytho"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rocon-app-manager rocon-app-utilities rocon-apps"
SRC_URI = "https://github.com/yujinrobot-release/rocon_app_platform-release/archive/release/kinetic/rocon_app_platform/0.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3de2808ce8969b41bc3b40f7980c5662"
SRC_URI[sha256sum] = "44717f9c5f7ef2726dad306020790386e127fc5fa3ff83bdfc1e7ad50d4315f8"
S = "${WORKDIR}/rocon_app_platform-release-release-kinetic-rocon_app_platform-0.9.1-0"

inherit catkin
