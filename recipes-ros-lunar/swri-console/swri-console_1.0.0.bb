# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A rosout GUI viewer developed at Southwest Research Insititute as an      altern"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin libqt5-core libqt5-gui libqt5-opengl-dev libqt5-widgets rosbag-storage roscpp rosgraph-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/swri_console-release/archive/release/lunar/swri_console/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "febc2cadcb5775fdb55bde60369cbed4"
SRC_URI[sha256sum] = "5f57fc96e5e39a97127d73494b4bb761022bf883700bf0257ceac988c9f92f51"
S = "${WORKDIR}/swri_console-release-release-lunar-swri_console-1.0.0-0"

inherit catkin
