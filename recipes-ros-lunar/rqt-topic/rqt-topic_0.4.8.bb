# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_topic provides a GUI plugin for displaying debug information about ROS topic"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin python-rospkg python-qt-binding rostopic rqt-gui rqt-gui-py std-msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_topic-release/archive/release/lunar/rqt_topic/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f0337bc6eebcc71c90e087e1d01453ce"
SRC_URI[sha256sum] = "0fd078e867e69ad608b3019a22abf2adf57e1f90b838380c593f63758fed4a15"
S = "${WORKDIR}/rqt_topic-release-release-lunar-rqt_topic-0.4.8-0"

inherit catkin
