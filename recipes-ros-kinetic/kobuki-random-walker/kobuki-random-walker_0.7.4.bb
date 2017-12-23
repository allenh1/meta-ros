# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Random walker app for Kobuki"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-threads geometry-msgs kobuki-msgs nodelet pluginlib roscpp std-msgs yocs-cmd-vel-mux yocs-controllers"
SRC_URI = "https://github.com/yujinrobot-release/kobuki-release/archive/release/kinetic/kobuki_random_walker/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4ba45a3fe649c0e338571a740ac7f179"
SRC_URI[sha256sum] = "113aa4d22684adc57e670bf1a7dbc614baf98cdb27502002a5223f8011ac0dc0"
S = "${WORKDIR}/kobuki-release-release-kinetic-kobuki_random_walker-0.7.4-0"

inherit catkin
