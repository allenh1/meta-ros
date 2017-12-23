# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The find_object_2d package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge genmsg image-transport message-filters qt-gui-cpp roscpp rospy sensor-msgs std-msgs std-srvs tf"
SRC_URI = "https://github.com/introlab/find_object_2d-release/archive/release/kinetic/find_object_2d/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4d6307be6a9c80ac4b13a35c6c82943e"
SRC_URI[sha256sum] = "94e39c0827a007fca6392a1b3c6a337c6badcc8c0569c181e483c1147b77154a"
S = "${WORKDIR}/find_object_2d-release-release-kinetic-find_object_2d-0.6.2-0"

inherit catkin
