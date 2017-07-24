# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_console provides a GUI plugin for displaying and filtering ROS messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native python-rospkg python-qt-binding roslib rospy rqt-gui rqt-gui-py rqt-logger-level rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_console-release/archive/release/lunar/rqt_console/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1127d0845bc08f176f3b5a533d838d64"
SRC_URI[sha256sum] = "b0bba8b42087042d813646bb084b3a69202dd28dc71f048414da7f16ab30c0ec"
S = "${WORKDIR}/rqt_console-release-release-lunar-rqt_console-0.4.8-0"

inherit catkin
