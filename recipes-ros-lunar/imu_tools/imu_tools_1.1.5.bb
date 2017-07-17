# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Various tools for IMU devices"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD, GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=b5591805751b9a19ed7240e7c3e2d7c1"

DEPENDS = "catkin imu_complementary_filter imu_filter_madgwick rviz_imu_plugin"
SRC_URI = "https://github.com/uos-gbp/imu_tools-release/archive/release/lunar/imu_tools/1.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "64623d52d50df9a43483f328dad2882b"
SRC_URI[sha256sum] = "77c4933a647c95930874e68cda8dfa02da09f03a98026099acbca1dfe1d74cfb"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
