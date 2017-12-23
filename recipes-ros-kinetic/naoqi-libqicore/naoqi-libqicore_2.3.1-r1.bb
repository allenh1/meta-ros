# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Aldebaran's libqicore: a layer on top of libqi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native naoqi-libqi"
SRC_URI = "https://github.com/ros-naoqi/libqicore-release/archive/release/kinetic/naoqi_libqicore/2.3.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0a2919b86772ad36998ef67561566cde"
SRC_URI[sha256sum] = "593042e1837931f5a094e7b782cfd27ef9b9c0527738015153f188b246d58206"
S = "${WORKDIR}/libqicore-release-release-kinetic-naoqi_libqicore-2.3.1-1"

inherit catkin
