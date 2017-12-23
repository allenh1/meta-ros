# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native jsk-footstep-msgs jsk-gui-msgs jsk-hark-msgs posedetection-msgs speech-recognition-msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/kinetic/jsk_common_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "31b57ec5e4fcd2f5f204e1732ac59951"
SRC_URI[sha256sum] = "1d518dbd1f6105588e087c459fe4e1b1270378437d3fe27d8ca5d02372550e43"
S = "${WORKDIR}/jsk_common_msgs-release-release-kinetic-jsk_common_msgs-4.3.1-0"

inherit catkin
