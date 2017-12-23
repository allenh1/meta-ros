# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_console provides a GUI plugin for displaying and filtering ROS messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding roslib rospy rqt-gui rqt-gui-py rqt-logger-level rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_console-release/archive/release/kinetic/rqt_console/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e7d9d372418b464c84a8857b7dccfba2"
SRC_URI[sha256sum] = "5c1685fb32ec44daadfabf5ac6c0a7423694b7ebe8256ce05556fde892dbf47c"
S = "${WORKDIR}/rqt_console-release-release-kinetic-rqt_console-0.4.8-0"

inherit catkin
