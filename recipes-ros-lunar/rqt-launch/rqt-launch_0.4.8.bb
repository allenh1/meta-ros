# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This rqt plugin ROS package provides easy view of .launch files.   User can also"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native python-qt-binding roslaunch rospy rqt-console rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_launch-release/archive/release/lunar/rqt_launch/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7e2fe0cff89161923f8778faf40c0189"
SRC_URI[sha256sum] = "5dd7364599b1dca58adf893b2b068320fd49cfc70838d4837ead7d7917da1c1a"
S = "${WORKDIR}/rqt_launch-release-release-lunar-rqt_launch-0.4.8-0"

inherit catkin
