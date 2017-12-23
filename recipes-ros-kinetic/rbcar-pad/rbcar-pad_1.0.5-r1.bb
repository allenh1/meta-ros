# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rbcar_pad package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ackermann-msgs catkin-native diagnostic-msgs diagnostic-updater geometry-msgs robotnik-msgs roscpp sensor-msgs std-msgs std-srvs"
SRC_URI = "https://github.com/RobotnikAutomation/rbcar_common-release/archive/release/kinetic/rbcar_pad/1.0.5-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1dd1cf86213b48276bd950f522ffc0f8"
SRC_URI[sha256sum] = "dd5731756cb7be109ec2c54b03453373602ca4a0a7d7deb75a0a95b24f4d2934"
S = "${WORKDIR}/rbcar_common-release-release-kinetic-rbcar_pad-1.0.5-1"

inherit catkin
