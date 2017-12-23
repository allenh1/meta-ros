# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "RVIZ plugin for IMU visualization"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libqt5-core libqt5-gui libqt5-widgets qtbase5-dev roscpp rviz"
SRC_URI = "https://github.com/uos-gbp/imu_tools-release/archive/release/kinetic/rviz_imu_plugin/1.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d3c038a495cb0592722b20a7acaeb215"
SRC_URI[sha256sum] = "2435d0f469a5f99b536eaec81660db6f5b21faf476cc4d46020a9ee017184ef0"
S = "${WORKDIR}/imu_tools-release-release-kinetic-rviz_imu_plugin-1.1.4-0"

inherit catkin
