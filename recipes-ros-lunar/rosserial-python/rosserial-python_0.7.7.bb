# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A Python-based implementation of the rosserial protocol."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs python-serial rospy rosserial-msgs"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/lunar/rosserial_python/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "55283d638091c20ec1142ebff4f15430"
SRC_URI[sha256sum] = "5d7805b0b0cb9300c0a1e9f2aaefd0cafcbb0aed147ffd1e495219eb3b447975"
S = "${WORKDIR}/rosserial-release-release-lunar-rosserial_python-0.7.7-0"

inherit catkin
