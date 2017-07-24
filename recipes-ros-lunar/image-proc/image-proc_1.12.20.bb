# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Single image rectification and color processing."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin cv-bridge dynamic-reconfigure image-geometry image-transport nodelet nodelet-topic-tools roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/image_proc/1.12.20-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a639f136997fe17831427a2d7ab8876e"
SRC_URI[sha256sum] = "672dbd8ae720622fbdc57e18a4d08b4a98859d0a115028965e5baa2ea4eedb8e"
S = "${WORKDIR}/image_pipeline-release-release-lunar-image_proc-1.12.20-0"

inherit catkin
