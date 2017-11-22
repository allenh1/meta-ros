# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Single image rectification and color processing."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin cv-bridge dynamic-reconfigure image-geometry image-transport nodelet nodelet-topic-tools roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/image_proc/1.12.21-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d24249ef7f6fa9017dcc7cfed6094fb6"
SRC_URI[sha256sum] = "aadb5778e58870aa448cf09cec3509776c7a9911f8d09792d748d5e9e4f2c19e"
S = "${WORKDIR}/image_pipeline-release-release-lunar-image_proc-1.12.21-0"

inherit catkin
