# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The smach viewer is a GUI that shows the state of hierarchical     SMACH state m"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin graphviz rostest smach-msgs smach-ros wxpython"
SRC_URI = "https://github.com/jbohren/executive_smach_visualization-release/archive/release/lunar/smach_viewer/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "91f2a85da9f3ab1bd9dc81c8efd6f19d"
SRC_URI[sha256sum] = "1b2e564550ebdc51e1edf5dd9d6c22354c0888875e7ee070c1182e13cb693369"
S = "${WORKDIR}/executive_smach_visualization-release-release-lunar-smach_viewer-2.0.1-0"

inherit catkin
