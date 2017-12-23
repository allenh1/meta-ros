# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extract a single ring of a Velodyne PointCloud2 and publish it as a LaserScan me"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/velodyne-release/archive/release/kinetic/velodyne_laserscan/1.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1e55ad3eb53d0c08edb20ece606c07e7"
SRC_URI[sha256sum] = "ad16c745522ba4504cd6db6da34c707e0fad2b32b363f433cf2c462e3acbce02"
S = "${WORKDIR}/velodyne-release-release-kinetic-velodyne_laserscan-1.3.0-0"

inherit catkin
