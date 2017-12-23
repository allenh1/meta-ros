# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "UMD camera metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native jpeg-streamer uvc-camera"
SRC_URI = "https://github.com/ros-drivers-gbp/camera_umd-release/archive/release/kinetic/camera_umd/0.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9d4a8a5d324f2dc00eddae7fde2a2fc9"
SRC_URI[sha256sum] = "3cdbab3dcfba338eee99571f58825da2404aa436c379c50ba904deb978b2a923"
S = "${WORKDIR}/camera_umd-release-release-kinetic-camera_umd-0.2.5-0"

inherit catkin
