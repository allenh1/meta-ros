# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_topic provides a GUI plugin for displaying debug information about ROS topic"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=32d3f7831887d9c0936b6549cc5c5ba4"

DEPENDS = "catkin python-rospkg python_qt_binding rostopic rqt_gui rqt_gui_py std_msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_topic-release/archive/release/lunar/rqt_topic/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f0337bc6eebcc71c90e087e1d01453ce"
SRC_URI[sha256sum] = "0fd078e867e69ad608b3019a22abf2adf57e1f90b838380c593f63758fed4a15"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
