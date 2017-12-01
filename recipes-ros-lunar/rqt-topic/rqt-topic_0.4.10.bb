# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_topic provides a GUI plugin for displaying debug information about ROS topic"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding rostopic rqt-gui rqt-gui-py std-msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_topic-release/archive/release/lunar/rqt_topic/0.4.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e4ba78ca1b9665147fbd2d72810c63e5"
SRC_URI[sha256sum] = "67ab0b30fdef851892aa73955f88554f292cd5bdc6cdbe45f60705621b5aae01"
S = "${WORKDIR}/rqt_topic-release-release-lunar-rqt_topic-0.4.10-0"

inherit catkin
