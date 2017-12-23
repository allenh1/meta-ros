# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Simple qt cmake build tools and master-chooser style application template."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native qt-build qt-create qt-tutorials"
SRC_URI = "https://github.com/yujinrobot-release/qt_ros-release/archive/release/kinetic/qt_ros/0.2.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2d1f5b39d469ad4ccdf108e6c6ef9af0"
SRC_URI[sha256sum] = "92acd7c664909c10b322133fbe782fdcbea175b21b85af38dbbf42719296e9e2"
S = "${WORKDIR}/qt_ros-release-release-kinetic-qt_ros-0.2.9-0"

inherit catkin
