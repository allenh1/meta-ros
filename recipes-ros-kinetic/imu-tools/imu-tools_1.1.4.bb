# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Various tools for IMU devices"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d81febe1baeaed0bfd599be384185f36"

DEPENDS = "catkin-native imu-complementary-filter imu-filter-madgwick rviz-imu-plugin"
SRC_URI = "https://github.com/uos-gbp/imu_tools-release/archive/release/kinetic/imu_tools/1.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f486e95f8faf82367ba6fa597b5504e4"
SRC_URI[sha256sum] = "494d4f28c0b2544eb0528bf0be81655fabc0c69b35abc208a5371706a264288c"
S = "${WORKDIR}/imu_tools-release-release-kinetic-imu_tools-1.1.4-0"

inherit catkin
