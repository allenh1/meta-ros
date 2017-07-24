# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Various tools for IMU devices"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d81febe1baeaed0bfd599be384185f36"

DEPENDS = "python-empy-native imu-complementary-filter imu-filter-madgwick rviz-imu-plugin"
SRC_URI = "https://github.com/uos-gbp/imu_tools-release/archive/release/lunar/imu_tools/1.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "64623d52d50df9a43483f328dad2882b"
SRC_URI[sha256sum] = "77c4933a647c95930874e68cda8dfa02da09f03a98026099acbca1dfe1d74cfb"
S = "${WORKDIR}/imu_tools-release-release-lunar-imu_tools-1.1.5-0"

inherit catkin
