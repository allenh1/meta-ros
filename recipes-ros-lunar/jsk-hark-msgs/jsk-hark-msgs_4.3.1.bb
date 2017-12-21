# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_hark_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/lunar/jsk_hark_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4eb0d1a73009ee1dbee4b746cecf0582"
SRC_URI[sha256sum] = "51eec0525d02e96e3a9b9cf02616ebe8873625a33a27f323205b64f840eeff83"
S = "${WORKDIR}/jsk_common_msgs-release-release-lunar-jsk_hark_msgs-4.3.1-0"

inherit catkin
