# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A rosout GUI viewer developed at Southwest Research Insititute as an      altern"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libqt5-core libqt5-gui libqt5-opengl-dev libqt5-widgets rosbag-storage roscpp rosgraph-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/swri_console-release/archive/release/kinetic/swri_console/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6a556a7940045c2385a7a9f6cdfc5617"
SRC_URI[sha256sum] = "e751d3d33d947d2d8762b97d72c666baf2b5947cbaec10f160689be39a0ba06f"
S = "${WORKDIR}/swri_console-release-release-kinetic-swri_console-1.0.0-0"

inherit catkin
