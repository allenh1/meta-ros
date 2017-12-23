# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A driver for IMUs compatible the microstrain 3DM-GX2 and 3DM-GX3 protocol. Inclu"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native diagnostic-updater log4cxx message-generation message-runtime roscpp self-test sensor-msgs std-msgs std-srvs tf"
SRC_URI = "https://github.com/ros-gbp/microstrain_3dmgx2_imu-release/archive/release/kinetic/microstrain_3dmgx2_imu/1.5.12-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1544e6583ceebf145de269a0ef15481b"
SRC_URI[sha256sum] = "7a44d0870f6145f9f6080a344e3d1a0c22ea3eb80c872ad409b0265d03a9780e"
S = "${WORKDIR}/microstrain_3dmgx2_imu-release-release-kinetic-microstrain_3dmgx2_imu-1.5.12-1"

inherit catkin
