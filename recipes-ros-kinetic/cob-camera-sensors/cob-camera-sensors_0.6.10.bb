# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "For more information read the readme.htm file located in"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost catkin-native cmake-modules cob-vision-utils cv-bridge image-transport libopencv-dev message-filters message-generation message-runtime polled-camera roscpp rospy sensor-msgs"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_camera_sensors/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b7d3da028964819d8129141eccc8fac1"
SRC_URI[sha256sum] = "7f42fc1555b5f89b022127802f8a3c0655fe189c9b8a07562bc4d022de7d16bd"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_camera_sensors-0.6.10-0"

inherit catkin
