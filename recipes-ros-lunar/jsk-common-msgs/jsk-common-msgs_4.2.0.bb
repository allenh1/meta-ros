# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin jsk-footstep-msgs jsk-gui-msgs jsk-hark-msgs posedetection-msgs speech-recognition-msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/lunar/jsk_common_msgs/4.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2d3a0f7210feda04ddeeee31189cc8b7"
SRC_URI[sha256sum] = "9053d2473bc53025412d217c5dffa0c0c2d9bb634f52fad933c2dbfa48e3465b"
S = "${WORKDIR}/jsk_common_msgs-release-release-lunar-jsk_common_msgs-4.2.0-0"

inherit catkin
