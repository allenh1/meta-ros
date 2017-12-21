# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native jsk-footstep-msgs jsk-gui-msgs jsk-hark-msgs posedetection-msgs speech-recognition-msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/lunar/jsk_common_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "39e356c2e675e86e44183fb626ae342e"
SRC_URI[sha256sum] = "2be9993a9fb506fb504b2c98056daf280f1cc5fae6a96f167271658e8a78fcb0"
S = "${WORKDIR}/jsk_common_msgs-release-release-lunar-jsk_common_msgs-4.3.1-0"

inherit catkin
