# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_topic provides a GUI plugin for displaying debug information about ROS topic"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding rostopic rqt-gui rqt-gui-py std-msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_topic-release/archive/release/lunar/rqt_topic/0.4.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8eca425b1ab86e4d374099e415cf70ea"
SRC_URI[sha256sum] = "bdd9acfd488861ceb83f89309ecb3f84abf1c5979a8fc70f02d6a1d11f9b9283"
S = "${WORKDIR}/rqt_topic-release-release-lunar-rqt_topic-0.4.9-0"

inherit catkin
