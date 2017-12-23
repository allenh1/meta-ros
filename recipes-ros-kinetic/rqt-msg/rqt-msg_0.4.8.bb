# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A Python GUI plugin for introspecting available ROS message types.   Note that t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding roslib rosmsg rospy rqt-console rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_msg-release/archive/release/kinetic/rqt_msg/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0971c32499f322a0947f35e298ce19c0"
SRC_URI[sha256sum] = "ab32f50e8a87776f8f062ad6fd88e5d7ec901cdf83d7a9651c97797ecf5a8cb3"
S = "${WORKDIR}/rqt_msg-release-release-kinetic-rqt_msg-0.4.8-0"

inherit catkin
