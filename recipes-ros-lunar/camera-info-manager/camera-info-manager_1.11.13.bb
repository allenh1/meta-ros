# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a C++ interface for camera calibration      information.  "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost camera-calibration-parsers catkin image-transport roscpp roslib rostest sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/lunar/camera_info_manager/1.11.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7d8d9ad7214d48bdca81affb3877a570"
SRC_URI[sha256sum] = "76bea33eed563058d9e9d3aecdfdcc472a0600fa1ad0c3a4b4b8d3d5eb9a39fa"
S = "${WORKDIR}/image_common-release-release-lunar-camera_info_manager-1.11.13-0"

inherit catkin
