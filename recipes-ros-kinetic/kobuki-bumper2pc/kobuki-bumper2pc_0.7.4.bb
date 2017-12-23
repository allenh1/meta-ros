# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Bumper/cliff to pointcloud nodelet:     Publish bumpers and cliff sensors events"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native kobuki-msgs nodelet pluginlib roscpp sensor-msgs"
SRC_URI = "https://github.com/yujinrobot-release/kobuki-release/archive/release/kinetic/kobuki_bumper2pc/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bfa210462aa9e4f2ea6d6082550a9bb3"
SRC_URI[sha256sum] = "1e4f99c3b2cd3d3582942a0e1ba93b853bb0758faa4330b235c7cd567670dc6b"
S = "${WORKDIR}/kobuki-release-release-kinetic-kobuki_bumper2pc-0.7.4-0"

inherit catkin
