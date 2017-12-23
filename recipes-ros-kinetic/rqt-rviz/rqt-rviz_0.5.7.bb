# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_rviz provides a GUI plugin embedding .     Note that this rqt plugin does NO"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native pluginlib rqt-gui rqt-gui-cpp rviz"
SRC_URI = "https://github.com/ros-gbp/rqt_rviz-release/archive/release/kinetic/rqt_rviz/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ca80a007b06f636115907252b3877e1d"
SRC_URI[sha256sum] = "aaf1ddda00793c263c954535a7d4c6f4d75b2f8ab50d573952c4448b5bf9c73c"
S = "${WORKDIR}/rqt_rviz-release-release-kinetic-rqt_rviz-0.5.7-0"

inherit catkin
