# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a C++ interface for camera calibration      information.  "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost camera-calibration-parsers catkin-native image-transport roscpp roslib rostest sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/kinetic/camera_info_manager/1.11.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3c9014234f60602009033adeda20534a"
SRC_URI[sha256sum] = "99173c8c962cf3339d30b7453a9e59fed2e36ab0b66de3197ea97d7d553d1646"
S = "${WORKDIR}/image_common-release-release-kinetic-camera_info_manager-1.11.13-0"

inherit catkin
