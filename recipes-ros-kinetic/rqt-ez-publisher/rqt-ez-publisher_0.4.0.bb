# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rqt_ez_publisher package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs python-catkin-pkg-native rospy rostest rqt-gui rqt-gui-py rqt-py-common tf tf2-msgs"
SRC_URI = "https://github.com/OTL/rqt_ez_publisher-release/archive/release/kinetic/rqt_ez_publisher/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c5aff38a3e423eeb287246c154a25d29"
SRC_URI[sha256sum] = "5e09434f9ddf8b391888579d2829b6496fe64e691d89526b823bacf4578f8820"
S = "${WORKDIR}/rqt_ez_publisher-release-release-kinetic-rqt_ez_publisher-0.4.0-0"

inherit catkin
