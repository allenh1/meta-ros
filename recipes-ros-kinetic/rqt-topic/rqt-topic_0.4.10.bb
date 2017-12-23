# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_topic provides a GUI plugin for displaying debug information about ROS topic"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding rostopic rqt-gui rqt-gui-py std-msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_topic-release/archive/release/kinetic/rqt_topic/0.4.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a25be4391897577ae29d14c66935536e"
SRC_URI[sha256sum] = "98fd009283ddeb6dad4e8b3e9f7a858efba4777c20b7219ef770607edf0282de"
S = "${WORKDIR}/rqt_topic-release-release-kinetic-rqt_topic-0.4.10-0"

inherit catkin
