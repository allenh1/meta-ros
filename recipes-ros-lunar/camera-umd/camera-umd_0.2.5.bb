# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "UMD camera metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native catkin jpeg-streamer uvc-camera"
SRC_URI = "https://github.com/ros-drivers-gbp/camera_umd-release/archive/release/lunar/camera_umd/0.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b37d18a89e71fe43bc0b38e756fabf36"
SRC_URI[sha256sum] = "8ade9df169b4e6bad5801fbe525fe47312e8f7bdf92fc386293114c05ed2ffa7"
S = "${WORKDIR}/camera_umd-release-release-lunar-camera_umd-0.2.5-0"

inherit catkin
