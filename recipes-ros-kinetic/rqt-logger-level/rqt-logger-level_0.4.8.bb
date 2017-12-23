# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_logger_level provides a GUI plugin for configuring the logger level of ROS n"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding rosnode rospy rosservice rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_logger_level-release/archive/release/kinetic/rqt_logger_level/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d757f620bc45906ab3c4412e06979e10"
SRC_URI[sha256sum] = "33884e98688fa012df84177c72c4850ba159bfc6c0cee6b2b595642c3e6d3575"
S = "${WORKDIR}/rqt_logger_level-release-release-kinetic-rqt_logger_level-0.4.8-0"

inherit catkin
